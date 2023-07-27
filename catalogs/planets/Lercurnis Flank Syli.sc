Moon	"Syli/Lercurnis III IV"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            0.0016
	Radius          904.52
	InertiaMoment   0.39941
	Obliquity       1
	EqAscendNode    -96.183
	TidalLocked     true

	Albedo          0.27
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Subglacial"
		Panspermia true
	}

	Surface
	{
		Preset         "lercurnis_flank_syli.cfg"
		SurfStyle       0.48495
		Randomize      (0.704, -0.381, -0.766)
		colorDistMagn   0.047885
		colorDistFreq   102.65
		detailScale     128
		drivenDarkening 0
		seaLevel        -0.35878
		snowLevel       2
		tropicLatitude  0.2912
		icecapLatitude  2
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26816
		heightTempGrad  0.625
		beachWidth      0.0011757
		tropicWidth     0.07
		mainFreq        1.8242
		venusFreq       2
		venusMagn       0.9542
		mareFreq        0.4
		mareDensity     1
		terraceProb     0.19581
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.035864
		dunesFreq       7.8582
		dunesFraction   0.55741
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      2.7232
		riversSin       7.6431
		riftsMagn       15
		riftsFreq       7
		riftsSin        10
		eqridgeMagn     0.1145
		eqridgeWidth    1
		eqridgeModMagn  1.584
		eqridgeModFreq  10
		canyonsMagn     0.43444
		canyonsFreq     0.37697
		canyonsFraction 0
		cracksMagn      0.03
		cracksFreq      0.2
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.4
		volcanoFreq     1.084
		volcanoDensity  0.27481
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.36641
		volcanoTemp     3000
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      25
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.75573
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
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
		PeriodDays      7.8218165
		SemiMajorAxisKm 333254.106
		Eccentricity    0.005
		Inclination     1
		AscendingNode   -96.1832061
		ArgOfPericenter 30.2290076
		MeanAnomaly     250.076336
	}
}

