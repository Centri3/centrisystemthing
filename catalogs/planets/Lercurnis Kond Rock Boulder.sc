DwarfMoon	"Boulder/Lercurnis B III I"
{
	ParentBody     "Rock"
	Class          "Asteroid"
	Mass            2.6809e-08
	Radius          20
	InertiaMoment   0.39946
	Oblateness      0.21985
	OblatenessInfo  0.18107
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true
    Age             0.008

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_rock_boulder.cfg"
		SurfStyle       0.88152
		Randomize      (0.997, 0.731, -0.450)
		colorDistMagn   0.9688
		colorDistFreq   1.5519
		detailScale     32
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.59717
		icecapLatitude  0.53435
		icecapHeight    0.47335
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15394
		heightTempGrad  0.625
		beachWidth      0.0014265
		tropicWidth     0.07
		mainFreq        0.80153
		venusFreq       0.76336
		venusMagn       0.49618
		mareDensity     0
		terraceProb     0.44077
		erosion         0
		montesMagn      1
		montesFreq      2
		montesSpiky     1
		montesFraction  1
		dunesFraction   0
		hillsMagn       0.2
		hillsFreq       10
		hillsFraction   1
		hills2Fraction  1
		eqridgeMagn     0.091603
		eqridgeWidth    0.029218
		eqridgeModMagn  0.72519
		eqridgeModFreq  3.0534
		canyonsFraction 0
		craterMagn      0.2
		craterFreq      0.4
		craterDensity   1
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.65649
		volcanoTemp     1328.2
		lavaCoverTidal  0
		lavaCoverSun    0.61832
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Gamma           1.3965
		Hapke           0.50382
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		TempMapMaxTemp  59019
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.165158596
		SemiMajorAxisKm 2397.58723
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     -10
	}
}

