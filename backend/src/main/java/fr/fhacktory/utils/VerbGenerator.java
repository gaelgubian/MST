package fr.fhacktory.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import lombok.experimental.UtilityClass;

@UtilityClass
public class VerbGenerator {

    private static final  List<String[]> verbs = Arrays.stream( new String [][] {
	    // Verbes en A
	    { "abaisser", "abandonner", "abasourdir", "abattre", "abêtir", "abhorrer", "abîmer", "abolir", "abonder",
		    "abonner", "aborder", "aboutir", "aboyer", "abréger", "abreuver", "abriter", "abrutir", "absenter",
		    "absoudre", "abstenir", "abstraire", "abuser", "accabler", "accaparer", "accéder", "accélérer",
		    "accentuer", "accepter", "accoler", "accommoder", "accompagner", "accomplir", "accorder",
		    "accoucher", "accourir", "accrocher", "accroire", "accroître", "accroupir", "accueillir",
		    "accumuler", "accuser", "acharner", "acheminer", "acheter", "achever", "aciérer", "aciseler",
		    "acquérir", "acquiescer", "acquitter", "acter", "activer", "actualiser", "adapter", "additionner",
		    "adhérer", "adire", "adjoindre", "admettre", "administrer", "admirer", "adonner", "adopter",
		    "adorer", "adoucir", "adresser", "advenir", "aérer", "affaiblir", "affecter", "affectionner",
		    "afférer", "affermir", "afficher", "affiner", "affirmer", "affliger", "affoler", "affranchir",
		    "affronter", "agacer", "agenouiller", "aggraver", "agir", "agiter", "agonir", "agrafer", "agrandir",
		    "agréer", "agréger", "agresser", "agripper", "aguerrir", "aider", "aiguiller", "aiguiser", "ailler",
		    "aimer", "airer", "ajouter", "alerter", "aliéner", "aligner", "alimenter", "aliter", "allécher",
		    "alléger", "alléguer", "aller", "allier", "allonger", "allouer", "allumer", "alourdir", "altérer",
		    "aluner", "alunir", "amarrer", "amasser", "améliorer", "aménager", "amener", "amenuiser", "amerrir",
		    "amoindrir", "amonceler", "amorcer", "amortir", "amourer", "amplifier", "amuïr", "amuser",
		    "analyser", "anéantir", "animer", "annihiler", "annoncer", "annoter", "annuler", "anticiper",
		    "apaiser", "apercevoir", "apeurer", "apitoyer", "aplanir", "aplatir", "apparaître", "apparenter",
		    "apparier", "apparoir", "appartenir", "appauvrir", "appeler", "appendre", "applaudir", "appliquer",
		    "apporter", "apposer", "apprécier", "appréhender", "apprendre", "apprêter", "approcher",
		    "approfondir", "approprier", "approuver", "approvisionner", "appuyer", "arborer", "arguer",
		    "arracher", "arranger", "arrêter", "arriver", "arrondir", "arroser", "aspirer", "assagir",
		    "assaillir", "assainir", "assassiner", "assembler", "assener", "asséner", "asseoir", "asservir",
		    "assiéger", "assimiler", "assister", "associer", "assombrir", "assommer", "assortir", "assoupir",
		    "assouplir", "assouvir", "assujettir", "assumer", "assurer", "astreindre", "attacher", "attaquer",
		    "attarder", "atteindre", "atteler", "attendre", "attendrir", "attenter", "atténuer", "atterrer",
		    "atterrir", "attester", "attirer", "attiser", "attraper", "attribuer", "augmenter", "autoriser",
		    "autosuggestionner", "avaler", "avancer", "aventurer", "avérer", "avertir", "aviser", "avoir",
		    "avouer", "avoyer", "axer" },

	    // Verbes en B
	    { "baigner", "bailler", "bâiller", "baisser", "balader", "balancer", "balayer", "balbutier", "bander",
		    "bannir", "baptiser", "barrer", "barrir", "basculer", "baser", "bâter", "bâtir", "battre",
		    "bavarder", "baver", "bayer", "béer", "bégayer", "bêler", "bénéficier", "bénir", "bercer",
		    "besogner", "bienvenir", "biner", "biper", "biser", "blaguer", "blâmer", "blanchir", "blêmir",
		    "blesser", "bleuir", "bloquer", "blottir", "boire", "boiser", "boiter", "boîter", "bonder",
		    "bondir", "bonifier", "bosser", "botter", "boucher", "bouder", "bouffer", "bouger", "bouillir",
		    "bouler", "bouleverser", "bourrer", "bousculer", "bouter", "braire", "bramer", "brancher",
		    "brandir", "branler", "brayer", "breveter", "bricoler", "briller", "brimbaler", "briser", "bronzer",
		    "brosser", "brouter", "broyer", "bruire", "brûler", "brumer", "brunir", "budgéter", "buriner" },

	    // Verbes en C
	    { "cacher", "cacheter", "calculer", "caler", "calmer", "caner", "capeler", "caper", "capter", "caqueter",
		    "caracoler", "caractériser", "caresser", "carreler", "caser", "casser", "causer", "caver", "céder",
		    "ceindre", "célébrer", "celer", "cerner", "certifier", "cesser", "chahuter", "chaloir", "chanceler",
		    "changer", "chanter", "charger", "charmer", "charrier", "chasser", "châtier", "chauffer",
		    "chausser", "chercher", "chérir", "cherrer", "chevaucher", "chialer", "choir", "choisir", "choper",
		    "choquer", "choyer", "chuchoter", "chuter", "circoncire", "circonscrire", "circuler", "cirer",
		    "ciseler", "citer", "claquer", "clarifier", "classer", "clignoter", "cliquer", "cloner", "clore",
		    "clôturer", "clouer", "cocher", "côcher", "cogiter", "cogner", "coiffer", "coincer", "coïncider",
		    "collaborer", "collecter", "collectionner", "coller", "colorer", "colorier", "combattre",
		    "combiner", "combler", "commander", "commencer", "commenter", "commercer", "commettre",
		    "communiquer", "comparaître", "comparer", "compatir", "compenser", "compiler", "complaire",
		    "compléter", "complexifier", "compliquer", "comporter", "composer", "comprendre", "compromettre",
		    "compter", "concéder", "concentrer", "concerner", "concevoir", "concilier", "conclure", "concourir",
		    "concurrencer", "condamner", "conditionner", "conduire", "confectionner", "conférer", "confesser",
		    "confier", "configurer", "confire", "confirmer", "confondre", "conformer", "confronter", "congeler",
		    "conjoindre", "conjuguer", "conjurer", "connaître", "connecter", "conquérir", "consacrer",
		    "conseiller", "consentir", "conserver", "considérer", "consister", "consoler", "consommer",
		    "constater", "constituer", "construire", "consulter", "consumer", "contacter", "contempler",
		    "contenir", "contenter", "conter", "continuer", "contraindre", "contrarier", "contredire",
		    "contrefaire", "contrer", "contrevenir", "contribuer", "contrôler", "convaincre", "convenir",
		    "convertir", "convier", "convoiter", "convoquer", "convoyer", "coopérer", "coordonner", "copier",
		    "corréler", "correspondre", "corriger", "corroborer", "corrompre", "coter", "cotiser", "côtoyer",
		    "coucher", "coudre", "couiner", "couler", "couper", "courbaturer", "courir", "courre", "coûter",
		    "couver", "couvrir", "cracher", "craindre", "cramer", "craquer", "créditer", "créer", "creuser",
		    "crever", "crier", "critiquer", "croire", "croiser", "croître", "croquer", "crosser", "crotter",
		    "croupir", "cueillir", "cuire", "cuisiner", "cultiver", "cumuler", "curer" },

	    // Verbes en D
	    { "daigner", "daller", "damer", "damner", "danser", "dater", "déballer", "débarquer", "débarrasser",
		    "débattre", "débiter", "déblatérer", "déblayer", "débloquer", "déborder", "déboucher", "débouillir",
		    "débrouiller", "débuter", "décaler", "décéder", "déceler", "décevoir", "décharger", "déchiqueter",
		    "déchirer", "déchoir", "décider", "déclarer", "déclencher", "décliner", "décoller", "décommettre",
		    "déconner", "décorer", "découdre", "découper", "décourager", "découvrir", "décrier", "décrire",
		    "décrocher", "décroître", "dédicacer", "dédier", "dédire", "déduire", "défaillir", "défaire",
		    "défendre", "défier", "défiler", "définir", "défoncer", "défrayer", "dégager", "dégeler",
		    "dégénérer", "déglutir", "dégourdir", "dégoûter", "déguerpir", "déguster", "déjeuner", "délayer",
		    "déléguer", "délier", "délivrer", "demander", "démanteler", "démarrer", "déménager", "démener",
		    "démentir", "démettre", "demeurer", "démissionner", "démolir", "démontrer", "démordre", "démunir",
		    "dénier", "dénigrer", "dénoncer", "dénuer", "dépanner", "départir", "dépasser", "dépecer",
		    "dépêcher", "dépeindre", "dépendre", "dépenser", "dépérir", "déplacer", "déplaire", "déplier",
		    "déployer", "déposer", "déprimer", "déranger", "déraper", "déroger", "dérouler", "désapprendre",
		    "descendre", "désespérer", "déshabiller", "désigner", "désirer", "désister", "désobéir", "désoler",
		    "dessaisir", "desservir", "dessiner", "destiner", "détacher", "détailler", "détaler", "détecter",
		    "déteindre", "détendre", "détenir", "détériorer", "déterminer", "détester", "détruire", "devancer",
		    "développer", "devenir", "dévêtir", "dévier", "deviner", "dévoiler", "devoir", "dévorer", "dévouer",
		    "dévoyer", "diagnostiquer", "dialoguer", "dicter", "différencier", "différer", "diffuser",
		    "digérer", "diluer", "diminuer", "dîner", "dire", "diriger", "disconvenir", "discourir", "discuter",
		    "disjoindre", "disparaître", "dispenser", "disperser", "disposer", "disputer", "dissiper",
		    "dissoudre", "distinguer", "distraire", "distribuer", "diverger", "divertir", "diviser", "divorcer",
		    "divulguer", "doigter", "doler", "dominer", "donner", "doper", "dorer", "dorloter", "dormir",
		    "doter", "doubler", "doucher", "douer", "douter", "draguer", "draper", "dresser", "duper",
		    "dupliquer", "durcir", "durer" },

	    // Verbes en E
	    { "ébahir", "ébattre", "éberluer", "éblouir", "échanger", "échapper", "écher", "échoir", "échouer",
		    "éclabousser", "éclaircir", "éclairer", "éclater", "éclore", "écoeurer", "éconduire", "écouler",
		    "écouter", "écraser", "écrier", "écrire", "éditer", "éduquer", "effacer", "effectuer", "effleurer",
		    "effondrer", "efforcer", "effrayer", "égaler", "égarer", "égayer", "égoutter", "égrainer",
		    "égrener", "éjaculer", "élaborer", "élaguer", "élancer", "élargir", "élever", "éliminer", "élire",
		    "éloigner", "émaner", "emballer", "embarquer", "embarrasser", "embatre", "embaucher", "embellir",
		    "embêter", "emboire", "embraser", "embrasser", "embrayer", "émerger", "émettre", "émier", "emmêler",
		    "emménager", "emmener", "émoudre", "émouvoir", "emparer", "empêcher", "empiéter", "empirer",
		    "emplir", "employer", "emporter", "empreindre", "empresser", "emprunter", "émuler", "encaisser",
		    "enchaîner", "enchanter", "enchérir", "enclore", "encourager", "encourir", "endommager", "endormir",
		    "enduire", "endurer", "énerver", "enfermer", "enfiler", "enflammer", "enfler", "enfoncer",
		    "enfouir", "enfreindre", "enfuir", "engager", "engendrer", "engloutir", "engueuler", "enivrer",
		    "enjoindre", "enlacer", "enlever", "ennoyer", "ennuyer", "énoncer", "enorgueillir", "énouer",
		    "enquérir", "enquêter", "enrayer", "enregistrer", "enrhumer", "enrichir", "enseigner", "ensevelir",
		    "ensorceler", "ensuivre", "entacher", "entamer", "entendre", "enter", "entériner", "enterrer",
		    "enthousiasmer", "entourer", "entraîner", "entre-haïr", "entreprendre", "entrer", "entretenir",
		    "entrevoir", "entrouvrir", "énucléer", "énumérer", "envahir", "envelopper", "envier", "envisager",
		    "envoler", "envoyer", "épaissir", "épandre", "épanouir", "épargner", "épater", "épeler", "épier",
		    "épiner", "éplucher", "épouser", "épousseter", "éprendre", "éprouver", "épuiser", "équiper",
		    "équivaloir", "errer", "escalader", "espérer", "essayer", "essouffler", "essuyer", "ester",
		    "estimer", "établir", "étaler", "étayer", "éteindre", "étendre", "éternuer", "étinceler",
		    "étiqueter", "étirer", "étoffer", "étonner", "étouffer", "étourdir", "être", "étrécir", "étreindre",
		    "étrenner", "étudier", "évacuer", "évader", "évaluer", "évanouir", "éveiller", "éviter", "évoluer",
		    "évoquer", "exagérer", "examiner", "exaucer", "excéder", "exceller", "exciter", "exclamer",
		    "exclure", "excuser", "exécrer", "exécuter", "exempter", "exercer", "exiger", "exister", "expédier",
		    "expirer", "expliquer", "exploiter", "explorer", "exploser", "exposer", "exprimer", "extasier",
		    "extraire" },

	    // Verbes en F
	    { "fabriquer", "fâcher", "faciliter", "façonner", "facturer", "fader", "faiblir", "failler", "faillir",
		    "faire", "falloir", "familiariser", "faner", "farcir", "fasciner", "fatiguer", "fauter",
		    "favoriser", "faxer", "feindre", "fêler", "féliciter", "fendre", "férir", "fermer", "festoyer",
		    "fêter", "feuilleter", "fiancer", "ficeler", "ficher", "fier", "figer", "figurer", "filer",
		    "filmer", "finaliser", "finir", "fixer", "flamboyer", "flâner", "flatter", "fléchir", "fleurir",
		    "flotter", "flûter", "foirer", "foncer", "fonctionner", "fonder", "fondre", "forcer", "forer",
		    "forger", "formater", "former", "formuler", "foudroyer", "fouetter", "fouiller", "fouir", "fournir",
		    "fourvoyer", "foutre", "fraîchir", "franchir", "frapper", "frayer", "freiner", "frémir",
		    "fréquenter", "frire", "froisser", "frôler", "frotter", "fuir", "fumer", "fureter", "fuser",
		    "fusionner" },

	    // Verbes en G
	    { "gâcher", "gager", "gagner", "galoper", "garantir", "garder", "garer", "garnir", "gaspiller", "gâter",
		    "gazer", "geindre", "geler", "gémir", "gêner", "générer", "gérer", "gésir", "gîter", "glacer",
		    "glander", "glisser", "gonfler", "gourer", "goûter", "grandir", "grasseyer", "gratter", "graver",
		    "gravir", "gréer", "grêler", "grever", "gréver", "grignoter", "grimper", "grogner", "gronder",
		    "grossir", "guérir", "guetter", "gueuler", "guider" },

	    // Verbes en H
	    { "habiliter", "habiller", "habiter", "habituer", "habler", "hacher", "haïr", "haler", "hâler", "haleter",
		    "halluciner", "hanter", "happer", "harceler", "hâter", "hausser", "haver", "havir", "héberger",
		    "héler", "hennir", "hériter", "hésiter", "heurter", "homogénéiser", "honnir", "honorer", "houer",
		    "huer", "huir", "humer", "humilier", "hurler" },

	    // Verbes en I
	    { "identifier", "ignorer", "illuminer", "illustrer", "imager", "imaginer", "imiter", "immiscer", "impacter",
		    "impartir", "impatienter", "implanter", "implémenter", "impliquer", "importer", "importuner",
		    "imposer", "imprégner", "impressionner", "imprimer", "inaugurer", "inciter", "incliner", "inclure",
		    "incomber", "indiquer", "induire", "influencer", "influer", "informer", "inhiber", "initier",
		    "inonder", "inquiéter", "inscrire", "insérer", "insinuer", "insister", "inspirer", "installer",
		    "instruire", "intégrer", "intensifier", "interagir", "interdire", "intéresser", "interférer",
		    "interpeller", "interpréter", "interroger", "interrompre", "intervenir", "intervertir",
		    "interviewer", "intriguer", "introduire", "inventer", "inverser", "investiguer", "investir",
		    "inviter", "ioder", "irriter", "isoler", "issir" },

	    // Verbes en J
	    { "jaillir", "jalouser", "japper", "jaser", "jaunir", "jeter", "jeûner", "joindre", "jongler", "jouer",
		    "jouir", "juger", "jurer", "justifier", "juter" },

	    // Verbes en K
	    { "kiffer", "koter" },

	    // Verbes en L
	    { "lacer", "lâcher", "lainer", "laisser", "lamenter", "lamer", "lancer", "languir", "laper", "larguer",
		    "lasser", "laver", "layer", "lécher", "léguer", "léser", "leurrer", "lever", "libérer", "licencier",
		    "lier", "limiter", "lire", "lister", "livrer", "loger", "longer", "lotir", "louer", "louper",
		    "louvoyer", "lover", "luire", "luter", "lutter", "luxer" },

	    // Verbes en M
	    { "mâcher", "maigrir", "maintenir", "maîtriser", "manager", "mander", "manger", "manier", "manifester",
		    "manipuler", "manquer", "maquiller", "marcher", "marier", "marquer", "marrer", "marteler", "masser",
		    "mater", "mâter", "maudire", "maugréer", "mécroire", "médire", "méditer", "méfier", "mélanger",
		    "mêler", "menacer", "ménager", "mendier", "mener", "mentionner", "mentir", "méprendre", "mériter",
		    "messeoir", "mesurer", "métrer", "mettre", "meuler", "meurtrir", "miauler", "migrer", "mijoter",
		    "mimer", "mincir", "miner", "mirer", "miser", "modeler", "modérer", "modifier", "moisir", "mollir",
		    "monnayer", "monter", "montrer", "moquer", "mordre", "morfondre", "motiver", "moucher", "moudre",
		    "mouiller", "mouler", "mourir", "mouver", "mouvoir", "muer", "multiplier", "munir", "murer",
		    "mûrir", "murmurer", "muser", "muter" },

	    // Verbes en N
	    { "nager", "naître", "narguer", "narrer", "naviguer", "nécessiter", "négliger", "négocier", "neiger",
		    "nettoyer", "nier", "niveler", "noircir", "nominer", "nommer", "noter", "notifier", "nouer",
		    "nourrir", "noyer", "nuer", "nuire" },

	    // Verbes en O
	    { "obéir", "obliger", "obscurcir", "obséder", "observer", "obtempérer", "obtenir", "occasionner", "occire",
		    "occlure", "occuper", "ocrer", "octroyer", "oeuvrer", "offenser", "officier", "offrir", "oindre",
		    "omettre", "opérer", "opposer", "opter", "ordonner", "organiser", "orienter", "orner", "osciller",
		    "oser", "ôter", "oublier", "ouïr", "ourdir", "ouvrer", "ouvrir" },

	    // Verbes en P
	    { "pagayer", "pager", "paître", "pâlir", "pallier", "paner", "panner", "panser", "paraître", "paramétrer",
		    "parcourir", "pardonner", "parer", "parfaire", "parier", "parler", "parrainer", "partager",
		    "participer", "partir", "parvenir", "passer", "passionner", "pâter", "patienter", "patiner",
		    "pâtir", "pauser", "paver", "payer", "peaufiner", "pêcher", "pécher", "pédaler", "peigner",
		    "peindre", "peiner", "peinturer", "peler", "pelleter", "pencher", "pendre", "pénétrer", "penser",
		    "percer", "percevoir", "perdre", "perdurer", "pérenniser", "périr", "permettre", "persévérer",
		    "persister", "persuader", "perturber", "peser", "pétrir", "photographier", "piéger", "pifer",
		    "pincer", "piper", "piquer", "placer", "plaider", "plaindre", "plaire", "plaisanter", "planer",
		    "planifier", "planter", "pleurer", "pleuvoir", "plier", "plonger", "ployer", "poiler", "poindre",
		    "pointer", "polir", "polluer", "pondre", "porter", "poser", "positionner", "posséder", "poster",
		    "postuler", "poter", "pourrir", "poursuivre", "pourvoir", "pousser", "pouvoir", "pratiquer",
		    "précéder", "prêcher", "précipiter", "préciser", "préconiser", "prédire", "préétablir", "préférer",
		    "prendre", "prénommer", "préoccuper", "préparer", "prescrire", "présenter", "préserver",
		    "pressentir", "presser", "prétendre", "prêter", "prévaloir", "prévenir", "prévoir", "prier",
		    "primer", "priser", "priver", "privilégier", "procéder", "procurer", "prodiguer", "produire",
		    "profiter", "programmer", "progresser", "projeter", "prolonger", "promener", "promettre",
		    "promouvoir", "prôner", "prononcer", "proposer", "proscrire", "protéger", "prouver", "provenir",
		    "provoquer", "publier", "puer", "puiser", "pulluler", "punir" },

	    // Verbes en Q
	    { "qualifier", "quémander", "querir", "quérir", "questionner", "quêter", "quitter" },

	    // Verbes en R
	    { "rabattre", "raccourcir", "raccrocher", "racheter", "raconter", "raffoler", "rafraîchir", "rager",
		    "raidir", "railler", "raire", "raisonner", "rajeunir", "rajouter", "ralentir", "râler", "rallier",
		    "ramasser", "ramener", "ramer", "ramollir", "ranger", "rapatrier", "rapetisser", "rappeler",
		    "rapporter", "rapprocher", "raser", "rassasier", "rassembler", "rasseoir", "rassir", "rassurer",
		    "rater", "rattacher", "rattraper", "ravager", "ravir", "ravoir", "rayer", "rayonner", "réagir",
		    "réaliser", "réapparaître", "réapprendre", "rebondir", "recéler", "receler", "recenser",
		    "réceptionner", "recevoir", "réchauffer", "rechercher", "réciter", "réclamer", "récolter",
		    "recommander", "recommencer", "récompenser", "réconcilier", "reconduire", "réconforter",
		    "reconnaître", "reconquérir", "reconstruire", "recontacter", "recopier", "recoudre", "recourir",
		    "recouvrer", "recouvrir", "recréer", "récréer", "récrire", "recruter", "rectifier", "recueillir",
		    "reculer", "récupérer", "redécouvrir", "redémarrer", "redescendre", "redevenir", "redevoir",
		    "rédiger", "redire", "redonner", "réduire", "réécrire", "réélire", "réer", "réessayer", "refaire",
		    "référencer", "référer", "refermer", "réfléchir", "refléter", "refroidir", "réfugier", "refuser",
		    "régaler", "regarder", "régir", "réglementer", "régler", "régner", "regretter", "regrouper",
		    "réinscrire", "réitérer", "rejeter", "rejoindre", "réjouir", "relâcher", "relancer", "relater",
		    "relayer", "relever", "relier", "relire", "reluire", "remarquer", "rembourser", "remédier",
		    "remémorer", "remercier", "remettre", "remonter", "remplacer", "remplir", "remporter", "remuer",
		    "rémunérer", "renaître", "renchérir", "rencontrer", "rendormir", "rendre", "renforcer", "renier",
		    "renommer", "renoncer", "renouveler", "renseigner", "renter", "rentrer", "renverser", "renvoyer",
		    "repaître", "répandre", "reparaître", "réparer", "reparler", "repartir", "répartir", "repasser",
		    "repeindre", "rependre", "repentir", "repérer", "répertorier", "répéter", "repleuvoir", "replier",
		    "répondre", "reporter", "reposer", "repousser", "reprendre", "représenter", "reprocher",
		    "reproduire", "requérir", "réserver", "résider", "résilier", "résister", "résonner", "résoudre",
		    "respecter", "respirer", "resplendir", "ressaisir", "ressayer", "ressembler", "ressentir",
		    "resserrer", "resservir", "ressortir", "ressusciter", "restaurer", "rester", "restituer",
		    "restreindre", "résulter", "résumer", "rétablir", "retarder", "retenir", "retentir", "retirer",
		    "retomber", "retourner", "retranscrire", "retransmettre", "rétrécir", "retrouver", "réunir",
		    "réussir", "revaloir", "rêvasser", "réveiller", "révéler", "revendiquer", "revendre", "revenir",
		    "rêver", "revêtir", "réviser", "revivre", "revoir", "revouloir", "rigoler", "rimer", "rincer",
		    "rire", "risquer", "rôder", "roder", "rompre", "ronfler", "ronger", "ronronner", "roquer", "roser",
		    "rôtir", "rougir", "rouler", "rouspéter", "rouvrir", "ruer", "rugir", "ruisseler" },

	    // Verbes en S
	    { "sacrifier", "saigner", "saillir", "saisir", "saler", "salir", "saloper", "saluer", "sangloter",
		    "saouler", "saper", "satisfaire", "saurer", "sauter", "sauvegarder", "sauver", "savoir", "savonner",
		    "savourer", "scanner", "sceller", "scier", "scinder", "scruter", "sécher", "secouer", "secourir",
		    "séduire", "séjourner", "sélectionner", "seller", "sembler", "semer", "sentir", "seoir", "séparer",
		    "serrer", "sertir", "servir", "sévir", "sevrer", "siéger", "siffler", "signaler", "signer",
		    "signifier", "simplifier", "siroter", "situer", "skier", "soigner", "solliciter", "solutionner",
		    "sommeiller", "sommer", "songer", "sonner", "sortir", "soucier", "souder", "soudoyer", "souffler",
		    "souffrir", "souhaiter", "soulager", "soûler", "soulever", "souligner", "soumettre", "soupçonner",
		    "souper", "soupirer", "sourdre", "sourire", "sous-entendre", "sous-tendre", "souscrire",
		    "soustraire", "soutenir", "souvenir", "spécifier", "statuer", "stipuler", "stocker", "stopper",
		    "stresser", "stupéfaire", "stupéfier", "subir", "subodorer", "subsister", "substituer", "subvenir",
		    "succéder", "succomber", "sucer", "suer", "suffire", "suffoquer", "suggérer", "suicider", "suivre",
		    "suppléer", "supplier", "supporter", "supposer", "supprimer", "supputer", "surfaire", "surfer",
		    "surgir", "surprendre", "sursauter", "surseoir", "surveiller", "survenir", "survivre", "susciter",
		    "suspendre", "sustenter", "susurrer" },

	    // Verbes en T
	    { "tacher", "tâcher", "tailler", "taire", "taler", "tanner", "taper", "tapir", "taquiner", "tarder",
		    "tarer", "tarir", "tasser", "tâter", "tatouer", "teindre", "teinter", "télécharger", "téléphoner",
		    "témoigner", "tendre", "tenir", "tenter", "terminer", "ternir", "tester", "têter", "téter",
		    "tiédir", "tinter", "tirer", "titiller", "toiler", "toiser", "tolérer", "tomber", "tomer", "tondre",
		    "tonner", "toquer", "tordre", "toucher", "tourner", "tournoyer", "tousser", "tracasser", "tracer",
		    "traduire", "trahir", "traîner", "traire", "traiter", "tramer", "transcrire", "transférer",
		    "transformer", "transmettre", "transparaître", "transporter", "travailler", "traverser", "trembler",
		    "tremper", "tressaillir", "tricher", "tricoter", "trier", "tripoter", "tromper", "trotter",
		    "troubler", "trouer", "trouver", "tuer", "tuiler", "tutoyer" },

	    // Verbes en U
	    { "unir", "urger", "uriner", "user", "utiliser" },

	    // Verbes en V
	    { "vagir", "vaguer", "vaincre", "valider", "valoir", "vanner", "vanter", "vaquer", "varier", "vaser",
		    "veiller", "vêler", "vendre", "vénérer", "venger", "venir", "venter", "verdir", "vérifier",
		    "vernir", "verrouiller", "verser", "vêtir", "vexer", "vider", "vieillir", "viner", "violer",
		    "virer", "viser", "visionner", "visiter", "visser", "vivre", "voguer", "voiler", "voir", "voler",
		    "voleter", "vomir", "voter", "vouer", "vouloir", "voûter", "vouvoyer", "voyager" },

	    // Verbes en Z
	    { "zapper", "zézayer" } }).collect(Collectors.toList());
    
    /**
     * Rrturn a random verb
     * @return
     */
    public static String getAVerb(){
	Random rand = new Random();	
	String[] randomVerbs = verbs.get(rand.nextInt(22));
	return randomVerbs[rand.nextInt(randomVerbs.length-1)];	
    }

}
