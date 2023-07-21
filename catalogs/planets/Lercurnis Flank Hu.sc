Moon	"Hu/Lercurnis III V"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            0.0014
	Radius          826.08
	InertiaMoment   0.39821
	Obliquity       0.1
	EqAscendNode    0
	TidalLocked     true

	Albedo          0.27
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_flank_hu.cfg"
		SurfStyle       0.82235
		Randomize      (-0.140, -0.148, 0.899)
		colorDistMagn   0.068818
		colorDistFreq   87.738
		detailScale     128
		drivenDarkening 0.43511
		seaLevel        0.17645
		snowLevel       2
		tropicLatitude  0.29287
		icecapLatitude  2
		icecapHeight    0.033938
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48755
		heightTempGrad  0.625
		beachWidth      0.0012086
		tropicWidth     0.07
		mainFreq        1.9881
		venusFreq       2
		venusMagn       0.76336
		mareFreq        2
		mareDensity     0.23664
		terraceProb     0.33214
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.049827
		dunesFreq       8.5679
		dunesFraction   0.90739
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      3.2745
		riversSin       8.2497
		riftsMagn       15
		riftsFreq       7
		riftsSin        10
		eqridgeMagn     0.038168
		eqridgeWidth    1
		eqridgeModMagn  1.7748
		eqridgeModFreq  10
		canyonsMagn     0.31619
		canyonsFreq     0.3244
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      2
		cracksOctaves   15
		craterMagn      0.5
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.15
		volcanoFreq     1.1603
		volcanoDensity  0.25954
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48855
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      35
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.76336
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
		PeriodDays      10.4290887
		SemiMajorAxisKm 403705.238
		Eccentricity    0.0001
		Inclination     0.1
		AscendingNode   -30
		ArgOfPericenter 100
		MeanAnomaly     0
	}
}

